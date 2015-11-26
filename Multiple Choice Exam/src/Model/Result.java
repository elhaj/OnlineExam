package Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;

import com.sun.istack.internal.Nullable;

public class Result implements Serializable{
	@EmbeddedId
	private result_id resultID;
	private Integer score;
	@Column(nullable=false)
	public Integer getScore() {
		return score;
	}

	@Column(nullable=false)
	public result_id getResultID() {
		return resultID;
	}

	public void setResultID(result_id resultID) {
		this.resultID = resultID;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
}
