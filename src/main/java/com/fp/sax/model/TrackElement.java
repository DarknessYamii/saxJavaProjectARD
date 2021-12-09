package com.fp.sax.model;
/**
 * Get every component of my XML
 * @author andre
 *
 */
public class TrackElement {
	private String TrackURI, TrackName, ArtistURIs, ArtistNames, AlbumURI, AlbumName, AlbumArtistURIs,AlbumArtistNames,AlbumReleaseDate, AlbumImageURL,TrackPreviewURL,AddedBy,AddedAt;
	private int DiscNumber, TrackNumber, TrackDuration, Popularity;
	private boolean Explicit;

	/**
	 * @return the trackURI
	 */
	public String getTrackURI() {
		return TrackURI;
	}

	/**
	 * @param trackURI the trackURI to set
	 */
	public void setTrackURI(String trackURI) {
		TrackURI = trackURI;
	}

	/**
	 * @return the trackName
	 */
	public String getTrackName() {
		return TrackName;
	}

	/**
	 * @param trackName the trackName to set
	 */
	public void setTrackName(String trackName) {
		TrackName = trackName;
	}

	/**
	 * @return the artistURIs
	 */
	public String getArtistURIs() {
		return ArtistURIs;
	}

	/**
	 * @param artistURIs the artistURIs to set
	 */
	public void setArtistURIs(String artistURIs) {
		ArtistURIs = artistURIs;
	}

	/**
	 * @return the artistNames
	 */
	public String getArtistNames() {
		return ArtistNames;
	}

	/**
	 * @param artistNames the artistNames to set
	 */
	public void setArtistNames(String artistNames) {
		ArtistNames = artistNames;
	}

	/**
	 * @return the albumURI
	 */
	public String getAlbumURI() {
		return AlbumURI;
	}

	/**
	 * @param albumURI the albumURI to set
	 */
	public void setAlbumURI(String albumURI) {
		AlbumURI = albumURI;
	}

	/**
	 * @return the albumName
	 */
	public String getAlbumName() {
		return AlbumName;
	}

	/**
	 * @param albumName the albumName to set
	 */
	public void setAlbumName(String albumName) {
		AlbumName = albumName;
	}

	/**
	 * @return the albumArtistURIs
	 */
	public String getAlbumArtistURIs() {
		return AlbumArtistURIs;
	}

	/**
	 * @param albumArtistURIs the albumArtistURIs to set
	 */
	public void setAlbumArtistURIs(String albumArtistURIs) {
		AlbumArtistURIs = albumArtistURIs;
	}

	/**
	 * @return the albumArtistNames
	 */
	public String getAlbumArtistNames() {
		return AlbumArtistNames;
	}

	/**
	 * @param albumArtistNames the albumArtistNames to set
	 */
	public void setAlbumArtistNames(String albumArtistNames) {
		AlbumArtistNames = albumArtistNames;
	}

	/**
	 * @return the albumReleaseDate
	 */
	public String getAlbumReleaseDate() {
		return AlbumReleaseDate;
	}

	/**
	 * @param albumReleaseDate the albumReleaseDate to set
	 */
	public void setAlbumReleaseDate(String albumReleaseDate) {
		AlbumReleaseDate = albumReleaseDate;
	}

	/**
	 * @return the albumImageURL
	 */
	public String getAlbumImageURL() {
		return AlbumImageURL;
	}

	/**
	 * @param albumImageURL the albumImageURL to set
	 */
	public void setAlbumImageURL(String albumImageURL) {
		AlbumImageURL = albumImageURL;
	}

	/**
	 * @return the trackPreviewURL
	 */
	public String getTrackPreviewURL() {
		return TrackPreviewURL;
	}

	/**
	 * @param trackPreviewURL the trackPreviewURL to set
	 */
	public void setTrackPreviewURL(String trackPreviewURL) {
		TrackPreviewURL = trackPreviewURL;
	}

	/**
	 * @return the addedBy
	 */
	public String getAddedBy() {
		return AddedBy;
	}

	/**
	 * @param addedBy the addedBy to set
	 */
	public void setAddedBy(String addedBy) {
		AddedBy = addedBy;
	}

	/**
	 * @return the addedAt
	 */
	public String getAddedAt() {
		return AddedAt;
	}

	/**
	 * @param addedAt the addedAt to set
	 */
	public void setAddedAt(String addedAt) {
		AddedAt = addedAt;
	}

	/**
	 * @return the discNumber
	 */
	public int getDiscNumber() {
		return DiscNumber;
	}

	/**
	 * @param discNumber the discNumber to set
	 */
	public void setDiscNumber(int discNumber) {
		DiscNumber = discNumber;
	}

	/**
	 * @return the trackNumber
	 */
	public int getTrackNumber() {
		return TrackNumber;
	}

	/**
	 * @param trackNumber the trackNumber to set
	 */
	public void setTrackNumber(int trackNumber) {
		TrackNumber = trackNumber;
	}

	/**
	 * @return the trackDuration
	 */
	public int getTrackDuration() {
		return TrackDuration;
	}

	/**
	 * @param trackDuration the trackDuration to set
	 */
	public void setTrackDuration(int trackDuration) {
		TrackDuration = trackDuration;
	}

	/**
	 * @return the popularity
	 */
	public int getPopularity() {
		return Popularity;
	}

	/**
	 * @param popularity the popularity to set
	 */
	public void setPopularity(int popularity) {
		Popularity = popularity;
	}

	/**
	 * @return the explicit
	 */
	public boolean isExplicit() {
		return Explicit;
	}

	/**
	 * @param explicit the explicit to set
	 */
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
