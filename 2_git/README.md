## Wprowadzenie do git

Praca programisty skupia się na edycji plików tekstowych zawierających kod oprogramowania. Oprogramowanie w większości sytuacji powstaje we współpracy wieloosobowych zespołów programistycznych. W takiej sytuacji konieczne jest wykorzystanie oprogramowania, które ułatwi współpracę między programistami oraz pracę indywidualnych programistów poprzez wersjonowanie kodu. 
Wersjami nazywamy grupę modyfikacji kodu które programista postanowi zapamiętać. Historycznie istniały rózne podejścia do wersjonowania kodu. Początkowo kazdy z programistów mógł pracować na odrębnym modułem oprogramowania łączenie tych modułów ze sobą było skomplikowanym procesem.  Pewnym postępem we współpracy było wprowadzenie mozliwości przechowywania wspólnej wersji kodu w repozytoriach zdalnych na przykład z wykorzystaniem protokołu ftp. Kolejnym krokiem milowym stała się mozliwość zapamiętywania wersji oprogramowania nazywanych rewizjami z wykorzystaniem systemów takich jak cvs. Minusem tego rozwiązania było to ze programiści musieli pracować na tej samej wersji oprogramowania. Kolejnym krokiem w rozwoju systemów zarządzania wersją było opracowanie rozproszonych systemów zarządzania wersjami oprogramowania takich jak git.

https://en.wikipedia.org/wiki/Version_control
https://en.wikipedia.org/wiki/Comparison_of_version-control_software#History_and_adoption

## Czy są systemy zarządzania kodem

## Instalacja git
Windows
https://git-scm.com/
Pobierz najnowszą wersję i zainstaluj ją na swoim systemie operacyjnym.

## Shell

## Inicjalizacja repozytorium.

```
git init
```

## Pobieranie kodu

```
git clone <url>
```

## Repozytoria zdalne i lokalne
https://git-scm.com/docs/git-remote

```
git remote [-v | --verbose]
git remote add [-t <branch>] [-m <master>] [-f] [--[no-]tags] [--mirror=(fetch|push)] <name> <url>
git remote rename <old> <new>
git remote remove <name>
git remote get-url [--push] [--all] <name>
git remote set-url [--push] <name> <newurl> [<oldurl>]
git remote set-url --add [--push] <name> <newurl>
git remote set-url --delete [--push] <name> <url>
git remote [-v | --verbose] show [-n] <name>…​
git remote [-v | --verbose] update [-p | --prune] [(<group> | <remote>)…​]
```

## Sprawdzanie Stanu

```
git status
```

## Zapisywanie lokalnych zmian

```
git add .
git commit -m"Initial Commit"
```

## Gałęzie projektu

https://www.atlassian.com/git/tutorials/using-branches

Wyświetl lokalne gałęzie
```
git branch 
```

Wyświetl zdalne gałęzie
```
git branch -r
```

Wyświetl wszystkie Gałęzie
```
git branch -a
```

## Tworzenie nowej gałęzi
https://www.atlassian.com/git/tutorials/using-branches/git-checkout

```
git checkout -b <nazwa gałęzi>
```

## Przechodzenie pomiędzy gałęziami

```
git checkout <nazwa gałęzi>
```
## Porównywanie gałęzi

## Łączenie gałęzi
https://www.atlassian.com/git/tutorials/using-branches/git-merge

## Kiedy pojawiają się konflikty?
https://www.atlassian.com/git/tutorials/using-branches/merge-conflicts

## Rozwiązywanie konfliktów

## Wysyłanie kodu do repozytorium zdalnego.

## Git Flow. Strategia pracy z gitem.

### Jak to działa

![Develop Branch](https://wac-cdn.atlassian.com/dam/jcr:a13c18d6-94f3-4fc4-84fb-2b8f1b2fd339/01%20How%20it%20works.svg)

### Feature branches
![Feature branches](https://wac-cdn.atlassian.com/dam/jcr:34c86360-8dea-4be4-92f7-6597d4d5bfae/02%20Feature%20branches.svg?cdnVersion=1811)

Tworzenie
```shell
git checkout develop
git checkout -b feature_branch
```

Kończenie
```
git checkout develop
git merge feature_branch
```

### Release branches
![Release branches](https://wac-cdn.atlassian.com/dam/jcr:8f00f1a4-ef2d-498a-a2c6-8020bb97902f/03%20Release%20branches.svg?cdnVersion=1811)

Tworzenie
```
git checkout develop
git checkout -b release/0.1.0
```

Kończenie
```
git checkout main
git merge release/0.1.0
```


### Hotfix branches
![Hotfix branches](https://wac-cdn.atlassian.com/dam/jcr:cc0b526e-adb7-4d45-874e-9bcea9898b4a/04%20Hotfix%20branches.svg?cdnVersion=1811)

```
git checkout main
git checkout -b hotfix_branch
```

```
git checkout main
git merge hotfix_branch
git checkout develop
git merge hotfix_branch
git branch -D hotfix_branch
```

###
![]()







## Rewizja Kodu.

## Merge Request


Materiały dodatkowe
(Lekcja 1)[https://www.youtube.com/watch?v=bYlzOy0ipSQ]
(Lekcja 2)[https://www.youtube.com/watch?v=NPb23pamIVg]
(Tutorial)[https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow#:~:text=The%20overall%20flow%20of%20Gitflow,branch%20is%20created%20from%20main&text=When%20a%20feature%20is%20complete%20it%20is%20merged%20into%20the,branch%20is%20created%20from%20main]