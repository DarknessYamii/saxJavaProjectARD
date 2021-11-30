package com.fp.sax.model;

public enum FestivalElements {
TRACK_URL("TrackURI"), TRACK_NAME("TrackName"), ARTIST_URIS("ArtistURIs"),ARTIST_NAMES("ArtistNames"), ALBUM_URI("AlbumURI"),ALBUM_NAME("AlbumName"), ALBUM_ARTIST_URIS("AlbumArtistURIs"), ALBUM_ARTISTS_NAMES("AlbumArtistNames"),ALBUM_RELEASE_DATE("AlbumReleaseDate"),ALBUM_IMAGE_URL("AlbumImageURL"),DISC_NUMBER("DiscNumber"),TRACK_NUMBER("TrackNumber"),TRACK_DURATION("TrackDuration"),TRACK_PREVIEW_URL("TrackPreviewURL"),EXPLICIT("Explicit"),POPULARITY("Popularity"),ADDED_BY("AddedBy"),ADDED_AT("AddedAt");

private String name;

private FestivalElements(String name) {
	this.name = name;
}

public String getName() {
	return name;
}
}
