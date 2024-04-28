public class LightBoard
{
  /** The lights on the board, where true represents on and false represents off.
   */
  private boolean[][] lights;

  /** Constructs a LightBoard object having numRows rows and numCols columns.
   * Precondition: numRows > 0, numCols > 0
   * Postcondition: each light has a 40% probability of being set to on.
   */
  public LightBoard(int numRows, int numCols)
  {
    for(int numRows = 0; numRows < lights.length; numRows++){
      for(int numCols = 0; numCols < lights[numRows].length; numCols++){
        if(Math.random() <= .4){
          lights[numRows][numCols] == true;
        }
        else lights[numRows][numCols] == false;
      }
    }
    return lights;

  }

  /** Evaluates a light in row index row and column index col and returns a status
   *  as described in part (b).
   *  Precondition: row and col are valid indexes in lights.
   */
  public boolean evaluateLight(int row, int col)
  {
    /* to be implemented in part (b) */
   for(int row = 0; row < light.length; row++){
     for(int col = 0; col < light[row].length; col++){
    if(light[row][col] && col % 2 == 0){
      return false;
    }
       else if(light[row][col] == false && col % 3 == 0 ){
         return true;
       }
       else return light[row][col];
     }
   }

  }
  public boolean[][] getLights()
  {
    return lights;
  }
  //used for testing
  public String toString()
  {
    String s = "";
    for (int r = 0; r < lights.length; r++)
    {
      for (int c = 0; c < lights[0].length; c++)
        if (lights[r][c])
          s += "*";
        else
          s += ".";
      s += "\n";
    }
    return s;
  }
  
}
