class Solve
{
  	// The first argument is the string. You need to save all permutations in the ArrayList passed as 4th argument named perm add() method.
	// Dont print the permutations as they will be printed after needed processing (sorting in lexicographical order) at back end.
    void permute(String str, String res, char check, int checkPos, ArrayList < String > perm) {
        if (str.length() == 0) {
            if (!(res.length() > checkPos && res.charAt(checkPos) == check)) {
                perm.add(res);
            }
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            permute(str.substring(0, i) + str.substring(i + 1), res + str.charAt(i), check, checkPos, perm);
        }
	}
    void desiredPermutations(String str, char ch, int pos, int l, int r, ArrayList < String > perm) {
        permute(str, "", ch, pos, perm);
    }

}