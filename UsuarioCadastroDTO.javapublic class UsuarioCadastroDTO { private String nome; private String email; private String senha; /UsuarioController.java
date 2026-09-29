@RestController 
@RequestMapping("/usuarios") 
public class UsuarioController {

@Autowired 
private UsuarioRepository repository;

@PostMapping 
public Usuario criarUsuario(@RequestBody UsuarioCadastroDTO dto) {
Usuario usuario = new Usuario(); 
usuario.setNome(dto.getNome()); 
usuario.setEmail(dto.getEmail()); 
usuario.setSenha(dto.getSenha());

return repository.save(usuario); } 
}
