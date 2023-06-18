class Calculator {  
  /** 
   * @param {number} value
   */
  constructor(value) {
      this.sum = value;
  }

  /** 
   * @param {number} value
   * @return {Calculator}
   */
  add(value){
      this.sum += value;
  }

  /** 
   * @param {number} value
   * @return {Calculator}
   */
  subtract(value){
      this.sum -= value;
  }

  /** 
   * @param {number} value
   * @return {Calculator}
   */  
  multiply(value) {
      this.sum *= value;
  }

  /** 
   * @param {number} value
   * @return {Calculator}
   */
  divide(value) {
      if(value==0){
          throw new Error("Division by zero is not allowed");
      }
      this.sum /= value;
  }
  
  /** 
   * @param {number} value
   * @return {Calculator}
   */
  power(value) {
      this.sum **= value;
  }
    
  /** 
   * @return {number}
   */
  getResult() {
      return this.sum;
  }
}