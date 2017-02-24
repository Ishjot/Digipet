public abstract class ControllerBase {
        public ViewBase view = null;
	
        public ControllerBase(ViewBase View) {
                view = View;
		if(view != null)
			View.setController(this);
        }
	
	public abstract void display();

	public abstract void navigateTo(String page);

    public void createPlayer(String name){
        String[] tmp = name.split("\\s+"); //does not matter how many spaces are in between yourname and petname
        SingletonPlayer.makePlayer(tmp[0], new Dog(tmp[1]));
    }
}
