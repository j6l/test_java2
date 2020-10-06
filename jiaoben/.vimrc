
set number 
filetype on
set history=1000
set nocompatible
set shiftwidth=4 
color evening 
syntax on
set autoindent 
set smartindent 
set tabstop=4 
set showmatch 
set guioptions-=T 
set vb t_vb= 
set ruler 
set nohls
set incsearch
if has("vms")
set nobackup
else
set backup
endif
inoremap( ()
inoremap[ []
inoremap{ {}
inoremap< <>


