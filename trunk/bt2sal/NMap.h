#pragma once
#include <map>
#include "NPosition.h"

template <class FirstType, class SecondType> class NMap 
{
public:
/*	void deleteEverything(){
		typename std::map<FirstType,SecondType>::iterator cPosition = m_map.begin();
		while(cPosition != m_map.end()){
			FirstType cFirst = (*cPosition).first;
			delete plStates;
			plStates = NULL;
		}
		cTranslateMain.m_cLocalStates.clear();
	}
*/
	void AddTail(SomeType item){
		m_list.push_back(item);
	}

	void AddHead(SomeType item){
		m_list.push_front(item);
	}

	void RemoveAll(){
		m_list.clear();
	}

	NPosition GetStartPosition(){
	//	std::list<SomeType>::iterator listposition;
	//	listposition = m_list.begin();
		//return listposition;
		//SomeType item;
		NPosition cPosition;
		cPosition.SetMapPointer(m_map);
		return cPosition;		
	}

	SomeType GetNext(NPosition &cPosition){
		// The &listposition is to make it pass by reference, so that it can be incremented.
		SomeType item;
		// Note that the blank item is first sent to cPosition, to tell it what type of iterator
		// is required.
		std::list<SomeType>::iterator listposition = cPosition.GetPointer(item);
		item = (SomeType) *listposition;
		cPosition.IncrementPointer();
		// Get the pointer again now that it was incremented.
		listposition = cPosition.GetPointer(item);
		if (listposition == m_list.end()){
			cPosition.SetIsNull();
		}
		return item;
	}

	int GetSize(){
		return m_list.size();
	}

	SomeType GetHead(){
		return (SomeType) m_list.front();
	}

	SomeType GetTail(){
		return (SomeType) m_list.back();
	}

	// GetTailPosition and GetPrev in ConBranching's uppaal.
	
	NPosition Find(SomeType item){
		NPosition cPosition;
		cPosition.SetPointer(m_list);
		bool bFoundItem = false;
		SomeType currentItem;
		std::list<SomeType>::iterator listposition = cPosition.GetPointer(item);
		currentItem = (SomeType) *listposition;	
		if (currentItem == item){
			bFoundItem = true;
		}
		
		while((listposition != m_list.end()) && (!bFoundItem)){
			cPosition.IncrementPointer();
			// Get the pointer again now that it was incremented.
			listposition = cPosition.GetPointer(item);
			if (listposition != m_list.end()){
				currentItem = (SomeType) *listposition;	
				if (currentItem == item){
					bFoundItem = true;
				}
			}
		}
							// This will either be pointing to the item
		return cPosition;	// or the end of the list if nothing was found.
	}

	void InsertAfter(NPosition &cPosition, SomeType item){
		SomeType emptyItem;
		std::list<SomeType>::iterator listposition = cPosition.GetPointer(emptyItem);
		m_list.insert(listposition, item);
	}

	void RemoveAt(NPosition &cPosition){
		SomeType item;
		std::list<SomeType>::iterator listposition = cPosition.GetPointer(item);
		m_list.erase(listposition);
	}

	// This is not used.
	bool IsNull(NPosition cPosition){
		SomeType item;
		std::list<SomeType>::iterator listposition = cPosition.GetPointer(item);
		if (listposition == m_list.end()){
			return true;
		}
		return false;
	}

	// This is not used.
	void SetToNull(typename std::list<SomeType>::iterator &listposition){
		listposition = m_list.end();
	}

	// Random - RemoveFromList() - purposely set position to NULL
	//

private:
	std::map<FirstType,SecondType> m_map;
//	std::list<SomeType>::iterator position;
};

