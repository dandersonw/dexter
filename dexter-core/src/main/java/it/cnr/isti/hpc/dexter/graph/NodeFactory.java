/**
 *  Copyright 2012 Diego Ceccarelli
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package it.cnr.isti.hpc.dexter.graph;


import it.cnr.isti.hpc.dexter.graph.ram.RamIncomingNodes;
import it.cnr.isti.hpc.dexter.graph.ram.RamOutcomingNodes;
import it.cnr.isti.hpc.dexter.hash.IdHelperFactory.Type;

/**
 * @author Diego Ceccarelli <diego.ceccarelli@isti.cnr.it>
 * 
 * Created on Oct 7, 2012
 */
public class NodeFactory {
	
	public enum Type {
		RAM, JDBM, HADOOP
	};
	
	
	public static final Type STD_TYPE = Type.RAM;
	
	public static NodesWriter getOutcomingNodeWriter(Type type){
//		if (type == Type.JDBM){
//			return JDBMOutcomingNodes.getInstance();
//		}
		if (type == Type.RAM){
			return RamOutcomingNodes.getInstance();
		}
		throw new UnsupportedOperationException();
	}
	
	public static NodesWriter getIncomingNodeWriter(Type type){
//		if (type == Type.JDBM){
//			return JDBMIncomingNodes.getInstance();
//		}
		if (type == Type.RAM){
			return RamIncomingNodes.getInstance();
		}
		throw new UnsupportedOperationException();
	}
	
	public static IncomingNodes getIncomingNodes(Type type){
//		if (type == Type.JDBM){
//			return JDBMIncomingNodes.getInstance();
//		}
		if (type == Type.RAM){
			return RamIncomingNodes.getInstance();
		}
		throw new UnsupportedOperationException();
	}
	
	public static OutcomingNodes getOutcomingNodes(Type type){
//		if (type == Type.JDBM){
//			return JDBMOutcomingNodes.getInstance();
//		}
		if (type == Type.RAM){
			return RamOutcomingNodes.getInstance();
		}
		throw new UnsupportedOperationException();
	}
		
	
	
	
	

}
