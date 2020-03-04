
public class cliente {

	private String Nombre;
	private String apellidoPPersona;
	private String apellidoMPersona;
	private String Domicilio;
	private int Clavelector;
	private String Curp;
	private String Estado;
	private String Localidad;
	private String Municipio;
	private String Emision;
	private int Seccion;
	private int Vigencia;
	private int AñoRegistro;
	private int FechaDeNacimiento;
	private String Sexo;
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidoPPersona() {
		return apellidoPPersona;
	}

	public void setApellidoPPersona(String apellidoPPersona) {
		this.apellidoPPersona = apellidoPPersona;
	}

	public String getApellidoMPersona() {
		return apellidoMPersona;
	}

	public void setApellidoMPersona(String apellidoMPersona) {
		this.apellidoMPersona = apellidoMPersona;
	}

	public String getDomicilio() {
		return Domicilio;
	}

	public void setDomicilio(String domicilio) {
		Domicilio = domicilio;
	}

	public int getClavelector() {
		return Clavelector;
	}

	public void setClavelector(int clavelector) {
		Clavelector = clavelector;
	}

	public String getCurp() {
		return Curp;
	}
	
	public void setCurp(String curp) {
		Curp = curp;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getLocalidad() {
		return Localidad;
	}

	public void setLocalidad(String localidad) {
		Localidad = localidad;
	}

	public String getMunicipio() {
		return Municipio;
	}

	public void setMunicipio(String municipio) {
		Municipio = municipio;
	}

	public String getEmision() {
		return Emision;
	}

	public void setEmision(String emision) {
		Emision = emision;
	}
	
	public int getSeccion() {
		return Seccion;
	}
	
	public void setSeccion(int seccion) {
		Seccion = seccion;
	}

	public int getVigencia() {
		return Vigencia;
	}

	public void setVigencia(int vigencia) {
		Vigencia = vigencia;
	}

	public int getAñoRegistro() {
		return AñoRegistro;
	}

	public void setAñoRegistro(int añoRegistro) {
		AñoRegistro = añoRegistro;
	}

	public int getFechaDeNacimiento() {
		return FechaDeNacimiento;
	}

	public void setFechaDeNacimiento(int fechaDeNacimiento) {
		FechaDeNacimiento = fechaDeNacimiento;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	@Override
	public String toString() {
		return "cliente [Nombre=" + Nombre + ", apellidoPPersona=" + apellidoPPersona + ", apellidoMPersona="
				+ apellidoMPersona + ", Domicilio=" + Domicilio + ", Clavelector=" + Clavelector + ", Curp=" + Curp
				+ ", Estado=" + Estado + ", Localidad=" + Localidad + ", Municipio=" + Municipio + ", Emision="
				+ Emision + ", Seccion=" + Seccion + ", Vigencia=" + Vigencia + ", AñoRegistro=" + AñoRegistro
				+ ", FechaDeNacimiento=" + FechaDeNacimiento + ", Sexo=" + Sexo + "]";
	}

}