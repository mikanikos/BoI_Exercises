package StruttureCollegate;

public class NodoListaI {
	public int info;
	public NodoListaI next;

	public NodoListaI(int i, NodoListaI n) {
	info = i; next = n; }

	public NodoListaI(int i) {
	info = i; next = null; }

	public NodoListaI() {
	info = 0; next = null; }

}