#pragma once
#include <map>
#include <list>
#include "NPosition.h"

template <class FirstType, class SecondType> class NMap 
{
public:

	NPosition GetStartPosition(){
		NPosition cPosition;
		cPosition.SetMapPointer(m_map);
		return cPosition;
	}

	void RemoveKey(FirstType item){

	}

	void GetNextAssoc(NPosition &cPosition, FirstType &item, SecondType &item2){
		typename std::map<FirstType,SecondType>::iterator listposition;
		listposition = cPosition.GetMapPointer(item,item2);
		// The &cposition is to make it pass by reference, so that it can be incremented.
		item = (FirstType) listposition->first;
		item2 = (SecondType) listposition->second; 
		cPosition.IncrementMapPointer();
		// Get the pointer again now that it was incremented.
		listposition = cPosition.GetMapPointer(item,item2);
		if (listposition == m_map.end()){
			cPosition.SetIsNull();
		}
	}
	
	int Lookup(FirstType item, SecondType &item2){
		typename std::map<FirstType,SecondType>::iterator listposition;
		listposition = m_map.find(item);
		if (listposition != m_map.end()){
			item2 = (SecondType) listposition->second;
			return 1;
		}
		return 0; // The item was not found.
	}

	void SetAt(FirstType item, SecondType item2){
		typename m_map.insert(std::pair<FirstType,SecondType>(item,item2));
	}

	void RemoveAll(){
		m_map.clear();
	}


private:
	std::map<FirstType,SecondType> m_map;
//	std::list<SomeType>::iterator position;
};

