
package service.impl;
import com.Tienda.domain.Categoria;
import dao.CategoriaDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CategoriaService;

@Service
public class CategoriasServicesImpl implements CategoriaService{
    @Autowired
    private CategoriaDao categoriaDao;
    @Override
    public List<Categoria> getCategories(boolean activos) {
       List<Categoria> lista=categoriaDao.findAll();
       
       if (activos){
           lista.removeIf(cat -> !cat.isActivo());
       
    }
    return lista;
}
}