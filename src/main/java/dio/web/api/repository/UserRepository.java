package dio.web.api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.web.api.model.Usuario;

@Repository
public class UserRepository {
    public void save(Usuario usuario) {
        
        if (usuario.getLogin()==null)
        throw new RuntimeException("Usuário não pode ser nulo");

       if (usuario.getId()==null){
              System.out.println("SAVE - Recebendo usuário na camada de repositório");
         } else {
              System.out.println("UPDATE - Recebendo usuário na camada de repositório");
       }

       System.err.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
    }

    public Usuario findByUsername(String username) {
        System.out.println(String.format("FIND/id - Buscando usuário %s", username));
        return new Usuario("glayson", "password");
    }

    public List <Usuario> findAll() {
        System.out.println("LIST - Listando usuários do sistema");
        List <Usuario> usuarios = new ArrayList <Usuario> ();
        usuarios.add(new Usuario("admin", "admin"));
        usuarios.add(new Usuario("user", "user"));
        return usuarios;
    }
    
    public void update() {
        System.out.println("Atualizando usuário");
    }
}
