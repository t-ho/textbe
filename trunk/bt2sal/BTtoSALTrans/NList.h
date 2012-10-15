#pragma once
#include <list>
#include "NPosition.h"
#include "NString.h"

template<class SomeType, class AnotherType> class NList 
{
public:
	void AddTail(SomeType item){
		m_list.push_back(item);
	}

	void AddHead(SomeType item){
		m_list.push_front(item);
	}

	void RemoveAll(){
		m_list.clear();
	}

	NPosition GetHeadPosition(){
	//	std::list<SomeType>::iterator listposition;
	//	listposition = m_list.begin();
		//return listposition;
		//SomeType item;
		NPosition cPosition;
		cPosition.SetPointer(m_list);
		return cPosition;		
	}

	SomeType GetNext(NPosition &cPosition){
		// The &listposition is to make it pass by reference, so that it can be incremented.
		SomeType item;
		// Note that the blank item is first sent to cPosition, to tell it what type of iterator
		// is required.
		typename std::list<SomeType>::iterator listposition = cPosition.GetPointer(item);
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

	void RemoveTail(){

	}

	void SetAt(NPosition cPosition, SomeType item){

	}

	int GetCount(){
		return 0;
	}

	// GetTailPosition and GetPrev in ConBranching's uppaal.
	
	NPosition Find(SomeType item){
		NPosition cPosition;
		cPosition.SetPointer(m_list);
		bool bFoundItem = false;
		SomeType currentItem;
		typename std::list<SomeType>::iterator listposition = cPosition.GetPointer(item);
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
		if (listposition == m_list.end()){
			cPosition.SetIsNull();
		}
							// This will either be pointing to the item
		return cPosition;	// or the end of the list if nothing was found.
	}

	void InsertAfter(NPosition &cPosition, SomeType item){
		SomeType emptyItem;
		typename std::list<SomeType>::iterator listposition = cPosition.GetPointer(emptyItem);
		m_list.insert(listposition, item);
	}

	void RemoveAt(NPosition &cPosition){
		SomeType item;
		typename std::list<SomeType>::iterator listposition = cPosition.GetPointer(item);
		m_list.erase(listposition);
	}

	// This is not used.
	bool IsNull(NPosition cPosition){
		SomeType item;
		typename std::list<SomeType>::iterator listposition = cPosition.GetPointer(item);
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
	typename std::list<SomeType> m_list;
//	std::list<SomeType>::iterator position;
};
