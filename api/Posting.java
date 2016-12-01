import java.util.Date;
import java.text.SimpleDateFormat;

public class Posting {
	private int no;
	private String title;
	private String text;
	private Date regdate;

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");

	public Posting(int no, String title, String text, Date regdate) {
		this.no = no;
		this.title = title;
		this.text = text;
		this.regdate = regdate;
	}

	public int getNo() {
		return no;
	}
	public String getTitle() {
		return title;
	}
	public String getText() {
		return text;
	}
	public Date getRegdate() {
		return regdate;
	}
	public String getPrettyRegdate() {
		String textDate = sdf.format(regdate);
		return textDate;
	}
}