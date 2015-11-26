package Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class result_id implements Serializable {

	@Column(name = "userID")
	private Integer userID;

	@Column(name = "examID")
	private Integer examID;

	@Column(nullable = false)
	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	@Column(nullable = false)
	public Integer getExamID() {
		return examID;
	}

	public void setExamID(Integer examID) {
		this.examID = examID;
	}
}
