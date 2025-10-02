package poly.edu.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Stundent {
	@NoArgsConstructor
	@AllArgsConstructor
	@Data
	@Builder
	public class Student {
	    private String id;
	    private String fullname;
	    private Boolean gender;

	    @Builder.Default
	    @DateTimeFormat(pattern = "yyyy-MM-dd")
	    private Date birthday = new Date();

	    @Builder.Default
	    private String photo = "photo.png";

	    private Double mark;
	}


}
