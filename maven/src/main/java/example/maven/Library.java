/*-
 * =====LICENSE-START=====
 * Java 11 Application
 * ------
 * Copyright (C) 2020 - 2023 Organization Name
 * ------
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * =====LICENSE-END=====
 */
/**
 * 
 */
package example.maven;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ICT
 *
 */
public class Library {

	Map<String, Integer> starMap;
	
	Library() {
		// TODO Auto-generated constructor stub
		this.starMap = new HashMap<>();
	}
	
	Library(Map<String, Integer> inMap){
		this.starMap = inMap;
	}
	
	public void addPairs(String k, int v) {
		this.starMap.put(k, v);
	}
	
	public void removePairsByKey(String k) {
		this.starMap.remove(k);
	}
	
	public int getValue(String k) {
		return this.starMap.get(k);
	}
	
	public boolean isStarKeyInMap(String k) {
		return this.starMap.containsKey(k);
	}
}
