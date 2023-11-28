import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SA.bibliocrud.entities.Usuario;
import com.SA.bibliocrud.repositorio.RepositorioFuncionario;
import com.SA.bibliocrud.services.ServiceUsuario;

@RestController
@RequestMapping(value = "/funcionarios")
public class ControllerFuncionario{

  @Autowired
  private RepositorioFuncionario repositorio;

  @GetMapping
  public List<Usuario> findAll(){
    List<Usuario> result =  repositorio.findAll();
    return result;
    
  }

  @PostMapping
  public Usuario insert(@RequestBody Usuario usuario) {
    Usuario result = repositorio.save(usuario);
    return result;
  }
 }