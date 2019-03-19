package com.jk.person.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jk.person.entity.CatUbigeo;
import com.jk.person.entity.MaeClie;
import com.jk.person.entity.MaePers;
import com.jk.person.entity.MaePersNatu;
import com.jk.person.entity.RelPersMediCont;
import com.jk.person.repository.CatUbigeoJpaRepository;
import com.jk.person.repository.MaeClieJpaRepository;
import com.jk.person.repository.RelPersMediContJpaRepository;
import com.jk.person.service.CatUbigeoService;
import com.jk.person.service.MaeClieService;
import com.jk.person.service.MaePersNatuService;
import com.jk.person.service.MaePersService;
import com.jk.person.service.RelPersMediContService;

@Service("maeClieServiceImpl")
public class MaeClieServiceImpl implements MaeClieService{

    @Autowired
    @Qualifier("maeClieJpaRepository")
    private MaeClieJpaRepository maeClieJpaRepository;
    
    @Autowired
    @Qualifier("maePersServiceImpl")
    private MaePersService maePersService;
    
    @Autowired
    @Qualifier("maePersNatuServiceImpl")
    private MaePersNatuService maePersNatuService;
    
    @Autowired
    @Qualifier("catUbigeoJpaRepository")
    private CatUbigeoJpaRepository catUbigeoJpaRepository;

    
    @Autowired
    @Qualifier("relPersMediContServiceImpl")
    private RelPersMediContService mediContService;
    
    @Autowired
    @Qualifier("relPersMediContJpaRepository")
    private RelPersMediContJpaRepository relPersMediContJpaRepository;
    
    @Override
    public List<MaeClie> listAll(){
        return maeClieJpaRepository.findAll();
    }
    
    @Transactional
    @Override
    public MaeClie add(MaeClie maeClie){
    	
    	MaePers maePers = maeClie.getMaePersNatu().getMaePers();
    	
    	List<RelPersMediCont> listRel = maePers.getPersMediConts();
    	maePers.setPersMediConts(null);  
    	
    	maePersService.add(maePers);    	
    	int id = maePers.getIdPers();
    	
    	for(RelPersMediCont rel:listRel) {
    		rel.setIdPers(maePers.getIdPers());
    		rel.setIdTipoMediCont(rel.getCatTipoMediCont().getIdTipoMediCont());
    		mediContService.add(rel);
    	}
    	
    	MaePersNatu persNatu = maeClie.getMaePersNatu();    	
    	persNatu.setMaePers(maePers);
    	persNatu.setIdPers(id);    	
    	
    	maeClie.setIdClie(id);   	    	
    	
    	maePersNatuService.add(maeClie.getMaePersNatu());    	
    	if(maeClie.getCatUbigeo() != null){
    		List<CatUbigeo> listU = catUbigeoJpaRepository.findByCodUbigeo(maeClie.getCatUbigeo().getCodUbigeo());
    		if(!listU.isEmpty()) {
    			maeClie.setCatUbigeo(listU.get(0));
    		}
    	}    	    	
        return maeClieJpaRepository.save(maeClie);
    }
    
    @Override
    public int remove(int id){        
        maeClieJpaRepository.deleteById(id);
        return 0;
    }
    
    @Override
    public MaeClie update(MaeClie maeClie){
    	
    	MaePers maePers = maeClie.getMaePersNatu().getMaePers();
    	maePers.setIdPers(maeClie.getIdClie());
    	
    	List<RelPersMediCont> listRel = maePers.getPersMediConts();
    	
    	int id = maeClie.getIdClie();
    	
    	if(listRel != null) {
    		for(RelPersMediCont rel:listRel) {
        		rel.setIdPers(maePers.getIdPers());
        		rel.setIdTipoMediCont(rel.getCatTipoMediCont().getIdTipoMediCont());
        		relPersMediContJpaRepository.save(rel);
        	}
    	}
    	
    	MaePersNatu persNatu = maeClie.getMaePersNatu();
    	persNatu.setIdPers(id);
    	
    	if(maeClie.getCatUbigeo() != null){
    		List<CatUbigeo> listU = catUbigeoJpaRepository.findByCodUbigeo(maeClie.getCatUbigeo().getCodUbigeo());
    		if(!listU.isEmpty()) {
    			maeClie.setCatUbigeo(listU.get(0));
    		}
    	}    	    	
        return maeClieJpaRepository.save(maeClie);
        
        
    }
    
    @Override    
    public List<MaeClie> findOne(Integer id){
        return maeClieJpaRepository.findByIdClieAndIndActivo(id, "A");
    }
    @Override
    public List<MaeClie> findByDireccion(java.lang.String direccion){
        return maeClieJpaRepository.findByDireccion(direccion);
    }
    @Override
    public List<MaeClie> findByCoordenada(java.lang.String coordenada){
        return maeClieJpaRepository.findByCoordenada(coordenada);
    }

	@Override
	public List<MaeClie> listAllActives() {
		return maeClieJpaRepository.findByIndActivo("A");
	}
}