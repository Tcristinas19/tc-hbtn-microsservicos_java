package com.song.demo;

public class Song {
	
	private Integer id;
	private String nome;
	private String artista;
	private String album;
	private String anoLancamento;
	
	public Song() {
		}
	
	public Song(String nome, String artista, String album, String anoLancamento) {
		this.nome = nome;
		this.artista = artista;
		this.album = album;
		this.anoLancamento = anoLancamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	@Override
	public int hashCode() {
		
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (nome != null ? nome.hashCode() : 0);
		result = 31 * result + (artista != null ? artista.hashCode() : 0);
		result = 31 * result + (album != null ? album.hashCode() : 0);
		result = 31 * result + (anoLancamento != null ? anoLancamento.hashCode() : 0);
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Song song = (Song) obj;
		
		if(id != null ? !id.equals(song.id) : song.id != null) return false;
		if(nome != null ? !nome.equals(song.nome) : song.nome != null) return false;
		if(artista != null ? !artista.equals(song.artista) : song.artista != null) return false;
		if(album != null ? !album.equals(song.album) : song.album != null) return false;
		
		return anoLancamento != null ? anoLancamento.equals(song.anoLancamento) : song.anoLancamento == null;
	}
	
	@Override
	public String toString() {
		return this.id + " - " + this.nome + " - " + this.artista + " - " + this.album + " - " + this.anoLancamento;
	}
}