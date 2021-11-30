package com.fp.sax.handler;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.fp.sax.model.FestivalElements;
import com.fp.sax.model.TrackElement;

public class FestivalHandler extends DefaultHandler {
	private boolean TrackURI, TrackName, ArtistURIs, ArtistNames, AlbumURI, AlbumName, AlbumArtistURIs,AlbumArtistNames,AlbumReleaseDate, AlbumImageURL,TrackPreviewURL,AddedBy,AddedAt;
	private boolean DiscNumber, TrackNumber, TrackDuration, Popularity;
	private boolean Explicit;
	
	private TrackElement currentTrack = new TrackElement();
	private List<TrackElement> track = new ArrayList<TrackElement>();
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals(FestivalElements.TRACK_URL.getName())) {
			TrackURI = true;
		}
		if (qName.equals(FestivalElements.TRACK_NAME.getName())) {
			TrackName = true;
		}
		if (qName.equals(FestivalElements.ARTIST_URIS.getName())) {
			ArtistURIs = true;
		}
		if (qName.equals(FestivalElements.ARTIST_NAMES.getName())) {
			ArtistNames = true;
		}
		if (qName.equals(FestivalElements.ALBUM_URI.getName())) {
			AlbumURI = true;
		}
		if (qName.equals(FestivalElements.ALBUM_NAME.getName())) {
			AlbumName = true;
		}
		if (qName.equals(FestivalElements.ALBUM_ARTIST_URIS.getName())) {
			AlbumArtistURIs = true;
		}
		if (qName.equals(FestivalElements.ALBUM_ARTISTS_NAMES.getName())) {
			AlbumArtistNames = true;
		}
		if (qName.equals(FestivalElements.ALBUM_RELEASE_DATE.getName())) {
			AlbumReleaseDate = true;
		}
		if (qName.equals(FestivalElements.ALBUM_IMAGE_URL.getName())) {
			AlbumImageURL = true;
		}
		if (qName.equals(FestivalElements.DISC_NUMBER.getName())) {
			DiscNumber = true;
		}
		if (qName.equals(FestivalElements.TRACK_NUMBER.getName())) {
			TrackNumber = true;
		}
		if (qName.equals(FestivalElements.TRACK_DURATION.getName())) {
			TrackDuration = true;
		}
		if (qName.equals(FestivalElements.TRACK_PREVIEW_URL.getName())) {
			TrackPreviewURL = true;
		}
		if (qName.equals(FestivalElements.EXPLICIT.getName())) {
			Explicit = true;
		}
		if (qName.equals(FestivalElements.POPULARITY.getName())) {
			Popularity = true;
		}
		if (qName.equals(FestivalElements.ADDED_BY.getName())) {
			AddedBy = true;
		}
		if (qName.equals(FestivalElements.ADDED_AT.getName())) {
			AddedAt = true;
		}
		
		
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if (TrackURI) {
			currentTrack.setTrackURI(new String(ch, start, length));
			TrackURI = false;
		}
		if (TrackName) {
			currentTrack.setTrackName(new String(ch, start, length));
			TrackName = false;
		}
		if (ArtistURIs) {
			currentTrack.setArtistURIs(new String(ch, start, length));
			ArtistURIs = false;
		}
		if (ArtistNames) {
			currentTrack.setArtistNames(new String(ch, start, length));
			ArtistNames = false;
		}
		if (AlbumURI) {
			currentTrack.setAlbumURI(new String(ch, start, length));
			AlbumURI = false;
		}
		if (AlbumName) {
			currentTrack.setAlbumName(new String(ch, start, length));
			AlbumName = false;
		}
		if (AlbumArtistURIs) {
			currentTrack.setAlbumArtistURIs(new String(ch, start, length));
			AlbumArtistURIs = false;
		}
		if (AlbumArtistNames) {
			currentTrack.setAlbumArtistNames(new String(ch, start, length));
			AlbumArtistNames = false;
		}
		if (AlbumReleaseDate) {
			currentTrack.setAlbumReleaseDate(new String(ch, start, length));
			AlbumReleaseDate = false;
		}
		if (AlbumImageURL) {
			currentTrack.setAlbumImageURL(new String(ch, start, length));
			AlbumImageURL = false;
		}
		if (DiscNumber) {
			currentTrack.setDiscNumber(Integer.parseInt(new String(ch, start, length)));
			DiscNumber = false;
		}
		if (TrackNumber) {
			currentTrack.setTrackNumber(Integer.parseInt(new String(ch, start, length)));
			TrackNumber = false;
		}
		if (TrackDuration) {
			currentTrack.setTrackDuration(Integer.parseInt(new String(ch, start, length)));
			TrackDuration = false;
		}
		if (TrackPreviewURL) {
			currentTrack.setTrackPreviewURL(new String(ch, start, length));
			TrackPreviewURL = false;
		}
		if (Explicit) {
			currentTrack.setExplicit(Boolean.parseBoolean(new String(ch, start, length)));
			Explicit = false;
		}
		if (Popularity) {
			currentTrack.setPopularity(Integer.parseInt(new String(ch, start, length)));
			Popularity = false;
		}
		if (AddedBy) {
			currentTrack.setAddedBy(new String(ch, start, length));
			AddedBy = false;
		}
		if (AddedAt) {
			currentTrack.setAddedAt(new String(ch, start, length));
			AddedAt = false;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equals(FestivalElements.TRACK_NAME.getName())) {
			track.add(currentTrack);
			currentTrack = new TrackElement();
		}
	}

	public List<TrackElement> getTrack() {
		return track;
	}
	
}
