#pragma once
#include <list>

template<class SomeType> class CNList  //or use typename
{
public:
	std::list<SomeType> m_list;
	void AddTail(SomeType item){
		m_list.push_back(item);
	}
	void AddHead(SomeType item){
		m_list.push_front(item);
	}
};
