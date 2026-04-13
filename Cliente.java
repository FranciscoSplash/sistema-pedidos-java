public class Cliente {
 private String nome;
 private String email;
 
 Cliente(String nome, String email){
    this.nome=nome;
    this.email = email;
 }

 public String getNome(){
    return nome;
 }
 public void setNome(String novoNome){
    this.nome =novoNome;
    
 }
public String getEmail(){
    return email;
}
public void setEmail(String novoEmail){
    this.email=novoEmail;

}
    public String toString(){
        return "Cliente{nome='" + nome + "', email='" + email + "'}";
    }
}
