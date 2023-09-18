package main;

public class Iphone implements MusicPlayer, MobileDevice, InternetBrowser{

	@Override
	public void displayPage(String url) {
		System.out.println("Displays the url page: " + url + " in iPhone browser.");		
	}

	@Override
	public void addNewTab() {
		System.out.println("Adding an empty new tab to the iPhone browser.");		
	}

	@Override
	public void refreshPage() {
		System.out.println("Page currently displayed in the browser is refreshed to show the latest version of the content.");		
	}

	@Override
	public void call(String number) {
		System.out.println("Initiating a phone call to the number: " + number);
	}

	@Override
	public void answer() {
		System.out.println("Answer an incoming phone call.");
	}

	@Override
	public void voiceMail() {
		System.out.println("Access voicemail messages where user can listen, manage and reply to them.");
	}

	@Override
	public void play(String media) {
		System.out.println("Starting music playback on the device, according to the media: " + media);
	}

	@Override
	public void pause() {
		System.out.println("Temporarily stops playback of running media content.");
	}

	@Override
	public void selectMusic(String musicName) {
		System.out.println("Plays the music: " + musicName);
	}

}
