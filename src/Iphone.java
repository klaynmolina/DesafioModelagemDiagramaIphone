public class Iphone implements MusicPlayer, MobileDevice, InternetBrowser{

	@Override
	public void displayPage(String url) {
		System.out.println("Displays the url page: "+url+ " in iPhone browser.");		
	}

	@Override
	public void addNewTab() {
		System.out.println("Adding an empty new tab to the iPhone browser");		
	}

	@Override
	public void refreshPage() {
		System.out.println("Page currently displayed in the browser is refreshed to show the latest version of the content.");		
	}

	@Override
	public void call() {
		System.out.println("");
	}

	@Override
	public void answer() {
		System.out.println("");
	}

	@Override
	public void voiceMail() {
		System.out.println("");
	}

	@Override
	public void play() {
		System.out.println("");
	}

	@Override
	public void pause() {
		System.out.println("");
	}

	@Override
	public void selectMusic() {
		System.out.println("");
	}

}
