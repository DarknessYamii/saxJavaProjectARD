package com.fp.sax.methods;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.fp.sax.handler.FestivalHandler;
import com.fp.sax.model.TrackElement;

public class SaxMethods {

	/**
	 * Print every row of XML
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 */
	public void searchAll() throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		FestivalHandler handler = new FestivalHandler();
		saxParser.parse("src/main/java/com/fp/resource/festival2DAM.xml", handler);
		List<TrackElement> list = handler.getTrack();
		// Print every attribute
		for (TrackElement track : list) {
			System.out.println("TrackURI: " + track.getTrackURI());
			System.out.println("TrackName: " + track.getTrackName());
			System.out.println("ArtistURIs: " + track.getArtistURIs());
			System.out.println("ArtistNames: " + track.getArtistNames());
			System.out.println("AlbumURI: " + track.getAlbumURI());
			System.out.println("AlbumName: " + track.getAlbumName());
			System.out.println("AlbumArtistURIs: " + track.getAlbumArtistURIs());
			System.out.println("AlbumArtistNames: " + track.getAlbumArtistNames());
			System.out.println("AlbumReleaseDate: " + track.getAlbumReleaseDate());
			System.out.println("AlbumImageURL: " + track.getAlbumImageURL());
			System.out.println("DiscNumber: " + track.getDiscNumber());
			System.out.println("TrackNumber: " + track.getTrackNumber());
			System.out.println("TrackDuration: " + track.getTrackDuration());
			System.out.println("TrackPreviewURL: " + track.getTrackPreviewURL());
			System.out.println("Explicit: " + track.isExplicit());
			System.out.println("Popularity: " + track.getPopularity());
			System.out.println("AddedBy: " + track.getAddedBy());
			System.out.println("AddedAt: " + track.getAddedAt());
			System.out.println(
					"---------------------------------------------------------------------------------------------");
		}
	}
}
	


