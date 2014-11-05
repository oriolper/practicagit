public class footballPlayers {
  private String dni;
  private String name;
  private String phone;
  private String email;

  /**
   * Constructor
   **/

  public Contact(String dni, String name, String phone, String email){
    this.dni = dni;
    this.name = name;
    this.phone = phone;
    this.email = email;
  }

  /**
   * Getters & setters
   **/
  public String getDni(){
    return this.dni;
  }

  public String getName(){
    return this.name;
  }

  public String getPhone(){
    return this.phone;
  }

  public String getEmail(){
    return this.email;
  }

  public void setDni(String dni){
    this.dni = dni;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setPhone(String phone){
    this.phone = phone;
  }

  public void setEmail(String email){
    this.email = email;
  }

}
