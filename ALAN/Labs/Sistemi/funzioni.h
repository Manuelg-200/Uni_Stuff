void swap(float& a, float& b);
float fattoriale(float n);
float** initMatrice(int righe, int colonne);
void SetMatrice(float **Matrice, int dim, const float array[]);
float** setPascal(int dim);
float** setTridiagonale(int dim);
float* TermineNoto(float** Matrice, int dim);
void stampaVettore(float *vect, int dim);
void Gauss(float** Matrice, float* Termine, int righe, int colonne);
float* SostituzioneIndietro(float** Matrice, float* Termine, int righe, int colonne);