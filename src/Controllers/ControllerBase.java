public abstract class ControllerBase {
        public ViewBase view = null;
	
        public ControllerBase(ViewBase View) {
                view = View;
		if(view != null)
			View.setController(this);
        }
	
	public abstract void display();

	public abstract void navigateTo(String page);
}
