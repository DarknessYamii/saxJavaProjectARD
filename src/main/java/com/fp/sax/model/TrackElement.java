package com.fp.sax.model;

public class TrackElement {
	private String TrackURI, TrackName, ArtistURIs, ArtistNames, AlbumURI, AlbumName, AlbumArtistURIs,AlbumArtistNames,AlbumReleaseDate, AlbumImageURL,TrackPreviewURL,AddedBy,AddedAt;
	private int DiscNumber, TrackNumber, TrackDuration, Popularity;
	private boolean Explicit;
	public String getTrackURI() {
		return TrackURI;
	}
	public void setTrackURI(String trackURI) {
		TrackURI = trackURI;
	}
	public String getTrackName() {
		return TrackName;
	}
	public void setTrackName(String trackName) {
		TrackName = trackName;
	}
	public String getArtistURIs() {
		return ArtistURIs;
	}
	public void setArtistURIs(String artistURIs) {
		ArtistURIs = artistURIs;
	}
	public String getArtistNames() {
		return ArtistNames;
	}
	public void setArtistNames(String artistNames) {
		ArtistNames = artistNames;
	}
	public String getAlbumURI() {
		return AlbumURI;
	}
	public void setAlbumURI(String albumURI) {
		AlbumURI = albumURI;
	}
	public String getAlbumName() {
		return AlbumName;
	}
	public void setAlbumName(String albumName) {
		AlbumName = albumName;
	}
	public String getAlbumArtistURIs() {
		return AlbumArtistURIs;
	}
	public void setAlbumArtistURIs(String albumArtistURIs) {
		AlbumArtistURIs = albumArtistURIs;
	}
	public String getAlbumArtistNames() {
		return AlbumArtistNames;
	}
	public void setAlbumArtistNames(String albumArtistNames) {
		AlbumArtistNames = albumArtistNames;
	}
	public String getAlbumReleaseDate() {
		return AlbumReleaseDate;
	}
	public void setAlbumReleaseDate(String albumReleaseDate) {
		AlbumReleaseDate = albumReleaseDate;
	}
	public String getAlbumImageURL() {
		return AlbumImageURL;
	}
	public void setAlbumImageURL(String albumImageURL) {
		AlbumImageURL = albumImageURL;
	}
	public String getTrackPreviewURL() {
		return TrackPreviewURL;
	}
	public void setTrackPreviewURL(String trackPreviewURL) {
		TrackPreviewURL = trackPreviewURL;
	}
	public String getAddedBy() {
		return AddedBy;
	}
	public void setAddedBy(String addedBy) {
		AddedBy = addedBy;
	}
	public String getAddedAt() {
		return AddedAt;
	}
	public void setAddedAt(String addedAt) {
		AddedAt = addedAt;
	}
	public int getDiscNumber() {
		return DiscNumber;
	}
	public void setDiscNumber(int discNumber) {
		DiscNumber = discNumber;
	}
	public int getTrackNumber() {
		return TrackNumber;
	}
	public void setTrackNumber(int trackNumber) {
		TrackNumber = trackNumber;
	}
	public int getTrackDuration() {
		return TrackDuration;
	}
	public void setTrackDuration(int trackDuration) {
		TrackDuration = trackDuration;
	}
	public int getPopularity() {
		return Popularity;
	}
	public void setPopularity(int popularity) {
		Popularity = popularity;
	}
	public boolean isExplicit() {
		return Explicit;
	}
	public void setExplicit(boolean explicit) {
		Explicit = explicit;
	}
	@Override
	public String toString() {
		return "TrackElement [TrackURI=" + TrackURI + ", TrackName=" + TrackName + ", ArtistURIs=" + ArtistURIs
				+ ", ArtistNames=" + ArtistNames + ", AlbumURI=" + AlbumURI + ", AlbumName=" + AlbumName
				+ ", AlbumArtistURIs=" + AlbumArtistURIs + ", AlbumArtistNames=" + AlbumArtistNames
				+ ", AlbumReleaseDate=" + AlbumReleaseDate + ", AlbumImageURL=" + AlbumImageURL + ", TrackPreviewURL="
				+ TrackPreviewURL + ", AddedBy=" + AddedBy + ", AddedAt=" + AddedAt + ", DiscNumber=" + DiscNumber
				+ ", TrackNumber=" + TrackNumber + ", TrackDuration=" + TrackDuration + ", Popularity=" + Popularity
				+ ", Explicit=" + Explicit + "]";
	}
}
