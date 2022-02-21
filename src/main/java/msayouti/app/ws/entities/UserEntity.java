package msayouti.app.ws.entities;


	
	import java.io.Serializable;


	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;


	@Entity
	@Table(name="users")
	public class UserEntity implements Serializable {

		
		private static final long serialVersionUID = -5763827745308343856L;
		
		@Id
		@GeneratedValue
		private long id;

		
		@Column(nullable=false, length=50)
		private String fullName;
		
		@Column(nullable=false, length=120, unique=true)
		private String email;


		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
}
