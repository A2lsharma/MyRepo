#input string: America’s Open Door Policy toward China. After the First Sino-Japanese War, in 1895, China faced competing pressures for preferentialtreatment from five imperialist powers, i.e., Britain, France, Russia,Japan, and Germany. The United States pivoted its foreign policyincreasingly toward Asia after winning the Spanish-American War of1898 and acquiring the Philippine Islands as a result. US commercialand political interests in China expanded. On September 6, 1899, USSecretary of State John Hay sent notes to the major powers asking themto declare formally that they would uphold Chinese territorial andadministrative integrity and would not interfere with the free use of thetreaty ports within their spheres of influence in China. The Open DoorPolicy stated that all nations, including the United States, could enjoyequal access to the Chinese market. The major powers agreed inprinciple but continued to press China for special concessions forrailroad rights, mining rights, loans, and foreign trade ports.;

inputString="America’s Open Door Policy toward China. After the First Sino-Japanese War, in 1895, China faced competing pressures for preferentialtreatment from five imperialist powers, i.e., Britain, France, Russia,Japan, and Germany. The United States pivoted its foreign policyincreasingly toward Asia after winning the Spanish-American War of1898 and acquiring the Philippine Islands as a result. US commercialand political interests in China expanded. On September 6, 1899, USSecretary of State John Hay sent notes to the major powers asking themto declare formally that they would uphold Chinese territorial andadministrative integrity and would not interfere with the free use of thetreaty ports within their spheres of influence in China. The Open DoorPolicy stated that all nations, including the United States, could enjoyequal access to the Chinese market. The major powers agreed inprinciple but continued to press China for special concessions forrailroad rights, mining rights, loans, and foreign trade ports.;"
freq={}

for char in inputString:
    if char in freq:
        freq[char]=freq[char]+1
    else:
        freq[char]=1
        
print(freq)