namespace esame.Models
{
    public class FroggerViewModel
    {
        public int Punteggio  { get; set; }

        public static void Ordina(List<FroggerViewModel> list)
        {
           for(int i = 0; i < list.Count; i++)
            {
                for(int j = 0; j < list.Count; j++)
                {
                    if(list[i].Punteggio > list[j].Punteggio)
                    {
                        int temp = list[i].Punteggio;
                        list[i].Punteggio = list[j].Punteggio;
                        list[j].Punteggio = temp;
                    }
                }
            }
        }

       
    }
}
