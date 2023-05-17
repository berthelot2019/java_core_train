package comparable_comparator_demo;

public class Bus implements Comparable<Bus> {
	  private Integer busId;
	  private String busname;
	  private Double fare;
	  private Double rating;
	public Integer getBusId() {
		return busId;
	}
	public void setBusId(Integer busId) {
		this.busId = busId;
	}
	public String getBusname() {
		return busname;
	}
	public void setBusname(String busname) {
		this.busname = busname;
	}
	public Double getFare() {
		return fare;
	}
	public void setFare(Double fare) {
		this.fare = fare;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
  
	@Override
	public String toString() {
		return "Bus [busId= "+busId+", busName = "+busname+",fare= "+fare+
				", rating= "+rating+"]";
	}
	
	public Bus(Integer busId, String busname, Double fare, Double rating) {
		super();
		this.busId=busId;
		this.busname=busname;
		this.fare=fare;
		this.rating=rating;
	}
	
	@Override
	public int compareTo(Bus o) {
		return o.busId.compareTo(this.busId);
	}

}
