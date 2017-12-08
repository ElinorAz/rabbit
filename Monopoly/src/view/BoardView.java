package view;

import java.util.ArrayList;

public class BoardView {
	
	private ArrayList<SquareView> squares;
	
	private SquareView Start;
	
	
	public BoardView(){
		this.squares= new ArrayList<SquareView>(41);
	}
	
	public void RestartBoardView() {
		SquareView s = new SquareView (1,600,290);
		this.squares.add(s);
		this.setStart(s);
		this.squares.add(new SquareView(2,500,290));
		this.squares.add(new SquareView(3,430,290));
		this.squares.add(new SquareView(4,350,290));
		this.squares.add(new SquareView(5,270,290));
		this.squares.add(new SquareView(6,190,290));
		this.squares.add(new SquareView(7,110,290));
		this.squares.add(new SquareView(8,30,290));
		this.squares.add(new SquareView(9,-50,290));
		this.squares.add(new SquareView(10,-130,290));
		this.squares.add(new SquareView(11,-210,290));
		this.squares.add(new SquareView(12,-210,370));
		this.squares.add(new SquareView(13,-210,420));
		this.squares.add(new SquareView(14,-210,480));
		this.squares.add(new SquareView(15,-210,540));
		this.squares.add(new SquareView(16,-210,600));
		this.squares.add(new SquareView(17,-210,660));
		this.squares.add(new SquareView(18,-210,710));
		this.squares.add(new SquareView(19,-210,760));
		this.squares.add(new SquareView(20,-210,810));
		this.squares.add(new SquareView(21,-210,880));
		this.squares.add(new SquareView(22,-130,880));
		this.squares.add(new SquareView(23,-50,880));
		this.squares.add(new SquareView(24,30,880));
		this.squares.add(new SquareView(25,110,880));
		this.squares.add(new SquareView(26,190,880));
		this.squares.add(new SquareView(27,270,880));
		this.squares.add(new SquareView(28,340,880));
		this.squares.add(new SquareView(29,420,880));
		this.squares.add(new SquareView(30,500,880));
		this.squares.add(new SquareView(31,580,880));
		this.squares.add(new SquareView(32,580,810));	
		this.squares.add(new SquareView(33,580,760));
		this.squares.add(new SquareView(34,580,700));
		this.squares.add(new SquareView(35,580,640));
		this.squares.add(new SquareView(36,580,590));
		this.squares.add(new SquareView(37,580,540));
		this.squares.add(new SquareView(38,580,480));
		this.squares.add(new SquareView(39,580,430));
		this.squares.add(new SquareView(40,580,380));
		
	}
	
	
	public ArrayList<SquareView> getSquares() {
		return squares;
	}

	public void setSquares(ArrayList<SquareView> squares) {
		this.squares = squares;
	}

	public BoardView(ArrayList<SquareView> sq) {
		this.squares = sq;
	}

	public SquareView getStart() {
		return Start;
	}

	public void setStart(SquareView start) {
		Start = start;
	}

}
